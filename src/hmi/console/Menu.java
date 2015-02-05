package hmi.console;

import com.sandklef.edu.ConsoleMenu.*;

import hmi.cli.ClubHelper;


public class Menu {
    
    ClubHelper ch ;
    
    public Menu(ClubHelper c) {
	ch = c;
    }

    public void run() {

   	ConsoleMenu menu = new ConsoleMenu("-----===< Club Manager >===-----");

   	
   	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    ch.printMembers(); } 
	    },"List members" );

	
   	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) {
			
		    ch.printMembersAlpha(); 
		    
		} 
	    },"List members in Alphabetical order" );

	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    String input = ch.askUser("Enter search string, you bastard: ");
		    String search = "%" + input.trim() + "%";
		    ch.printMembers(search); 
		}
	    },"Search for member" );

	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    String input = ch.askUser("Enter search string, Bob Dylan: ");
		    String search = "%" + input.trim() + "%";
		    ch.printMembers(search); 
		}
	    },"One more coffee" );

	menu.run();
    }

}
