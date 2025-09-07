package Inheritance.singleInheritance.RealScenarios.WashingMachine;

public class TypeOfWash {
	void normalWash() {
		System.out.println("Washing clothes in normal mode...\n It takes 45 mins to complete the wash.");
	}
	void quickWash() {
		System.out.println("Quick wash started...\nIt takes 20 minutes to complete .");
	}
	void heavyWash() {
		System.out.println("Heavy wash started....\nIt takes 2 hours to complete .");
	}
	void dryWash() {
		System.out.println("Dry cycle started...\nIt takes 15 minutes");
	}
	void ecoWash() {
        System.out.println("Eco wash started (water and energy saving).");
    }
}
