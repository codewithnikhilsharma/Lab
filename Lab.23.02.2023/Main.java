package com.cognizant.shapes;

class Sports {

    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {

    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}

	public class Main {
	    public static void main(String[] args) {
	        Sports sports = new Sports();
	        sports.getNumberOfTeamMembers();

	        Soccer soccer = new Soccer();
	        soccer.getNumberOfTeamMembers();
	    }
	}

