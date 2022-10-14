/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstcase;

/**
 *
 * @author Selin
 */
public class Employee {
        
        String name;
	float salary;
	float workHours;
	int hireYear;

	public Employee(String name, float salary, float workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public float tax(float salary) {

		float tax = 0;

		tax = salary > 1000 ? (salary / 100) * 3 : 0;

		return tax;
		
	}

	public float bonus(float workHours) {

		float bonus;

		bonus = (workHours > 40) ? workHours * 30 : 0;

		return bonus;
		/*
		 * if(workHours > 40) { bonus = workHours*30; return bonus; } else { bonus = 0;
		 * return bonus; }
		 */
	}

	public float raiseSalary(int hireYear, float salary) {

                float lastSalary = salary -this.tax(salary) + this.bonus(workHours);
                
		float raiseSalary=0;
		int difference = 2021 - hireYear;

		if (difference < 10) {

			raiseSalary = (lastSalary / 100) * 5;
			return raiseSalary;

		} else if (difference > 9 && difference < 20) {

			raiseSalary = (lastSalary / 100) * 10;
			return raiseSalary;

		} else if (difference > 19) {
			raiseSalary = (lastSalary / 100) * 15;
			return raiseSalary;

		} else {
			return raiseSalary;
		}
	}

        @Override
	public String toString() {
            
            float salaryWithTaxAndBonus; 
            salaryWithTaxAndBonus = this.salary + this.bonus(workHours) - this.tax(salary);
            
            float totalSalary;
            totalSalary = this.salary + this.bonus(workHours);
            
            return "Name : " + this.name + "\nSalary : " + this.salary + "\nWork Hours :" + this.workHours
                   + "\nHire Year : " + this.hireYear + "\nTax : " + this.tax(salary) + "\nBonus : "
                   + this.bonus(workHours) + "\nRise in Salary : " + this.raiseSalary(hireYear, salary)
                   + "\nSalary with tax and bonus : " + salaryWithTaxAndBonus
                   + "\nTotal Salary : " + totalSalary;
	}
}
