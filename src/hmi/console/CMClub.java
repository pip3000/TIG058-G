package hmi.console;

import java.util.ArrayList;
import java.util.Collections;

import registry.ClubRegistry;
import member.Member;
import member.MemberAlphaComparator;
import member.MemberAlphaFirstnameComparator;
import log.Logger;

import hmi.cli.ClubHelper;


public class CMClub {

    public static void printProp(String s, String prop) {
	String propValue = System.getProperty(prop);
	if (propValue!=null) {
	    System.out.println(s + propValue );
	}
    }

    public static void main(String[] args) {
	final ClubHelper ch = new ClubHelper();
	Menu m = new Menu(ch);
	m.run();

    }

}
