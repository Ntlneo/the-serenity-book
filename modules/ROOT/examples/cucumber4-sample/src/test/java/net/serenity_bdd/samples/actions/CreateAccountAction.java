package net.serenity_bdd.samples.actions;

import net.thucydides.core.annotations.Step;

public class CreateAccountAction {
    String customerName;
    String accountType;

    public CreateAccountAction forCustomer(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public CreateAccountAction ofType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    @Step("Create a #accountType account for customer #customerName with a balance of ${0}")
    public int withABalanceOf(int balance) {
        // Call the appropriate web service
        return 1;
    }
}
