/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noahn
 */
import java.util.ArrayList;
import java.util.List;

public class BudgetLogic {
    //this class can handle monetary logic
    private double needs; //50%
    private double wants; //30%
    private double savings; //20%
    private double income;
    
    //add Array lists for showing items in each category
    //add methods for getting totals spent displayed
    
    public BudgetLogic (double income) {
        this.income = income;
        calculateCategories();
    }
    
    //getters and setters
    public double GetNeeds() {
        return needs;
    }
    public double GetWants() {
        return wants;
    }
    public double GetSavings() {
        return savings;
    }
    public double getIncome() {
        return income;
    }
    public void setIncome(double income) {
        this.income = income;
        calculateCategories();
    }
    
    //logic methods
    private void calculateCategories() {
        needs = income * .5;
        wants = income * .3;
        savings = income *.2;
    }
    
}
