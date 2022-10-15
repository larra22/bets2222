package gui;

import java.beans.PropertyChangeEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JCalendar;

public interface IMetodosGUI {
	
	public void crearTablaEventos();
	
	public void crearCalendarios(PropertyChangeEvent propertychangeevent, JCalendar jCalendar2, Calendar calendarAnt, Calendar calendarAct,
			Vector<Date> datesWithEventsCurrentMonth, JTable tableEvents, DefaultTableModel tableModelEvents, JLabel jLabelEvents, 
			JLabel jLabelQueries, String[] columnNamesEvents);

}
