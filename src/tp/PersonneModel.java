package tp;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class PersonneModel extends AbstractTableModel {
	
	ResultSetMetaData rsmd;

	ArrayList<Object[]> data=new ArrayList<Object[]>(); //data howa ensble de ligne wkol lignef eha des colonnes
	PersonneManager pm=new PersonneManager();

	PersonneModel(ResultSet rs) {

		try {
			rsmd=rs.getMetaData();// feha qq methodes kima columcount wcolumname...
			while(rs.next()) {//rs.next tparcouri les lignes

				Object[]ligne=new Object[rsmd.getColumnCount()];
				for (int i=1 ; i<=rsmd.getColumnCount() ; i++) {
					ligne[i-1]=rs.getObject(i);
				}


				
				data.add(ligne);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	PersonneModel() {
		
	}

	@Override
	public int getColumnCount() {

		try {
			return rsmd.getColumnCount();
		} catch (SQLException e) {

			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int getRowCount() {

		return data.size();
	}


	@Override
	public Object getValueAt(int l, int c) {

		return (data.get(l))[c];


	}
	
	@Override
	public String getColumnName(int c) {
		
		//return super.getColumnName(column);//talaani abcd 
		try {
			return rsmd.getColumnName(c+1);
		} catch (SQLException e) {
			return null;
		}
	}
	
	
	int nomToIndice(String ch) {
		int a=-1;
		for(int i=0; i<getColumnCount();i++) {
			if (getColumnName(i).equals(ch)) return i;
		}
		return a;
	}
	
	
	public void ajouter(String nomp, String pos, String email, String tel) {
		data.add(new Object[] {nomp,pos,email,tel});
		pm.ajouterMembre(nomp, pos, email, tel);
		this.fireTableDataChanged();
		
	}

}
