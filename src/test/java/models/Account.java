package models;

public class Account {
    String name,
            webSite,
            type,
            description,
            parentAccount,
            phone,
            industry,
            billingAddress,
            billingCity,
            billingStreet,
            billingState,
            billingZip,
            billingCountry,
            shippingAddress,
            shippingStreet,
            shippingCity,
            shippingState,
            shippingZip,
            shippingCountry;
    Integer employees;

    public static class Builder {
        private Account newAccount;

        public Builder() {
            newAccount = new Account();
        }

        public Builder withName(String name) {
            newAccount.name = name;
            return this;
        }

        public Builder withWebSite(String webSite) {
            newAccount.webSite = webSite;
            return this;
        }

        public Builder withType(String type) {
            newAccount.type = type;
            return this;
        }

        public Builder withDescription(String description) {
            newAccount.description = description;
            return this;
        }

        public Builder withParentAccount(String parentAccount) {
            newAccount.parentAccount = parentAccount;
            return this;
        }

        public Builder withPhone(String phone) {
            newAccount.phone = phone;
            return this;
        }

        public Builder withIndustry(String industry) {
            newAccount.industry = industry;
            return this;
        }

        public Builder withEmployees(Integer employees) {
            newAccount.employees = employees;
            return this;
        }

        public Builder withBillingAddress(String billingAddress) {
            newAccount.billingAddress = billingAddress;
            return this;
        }

        public Builder withBillingStreet(String billingStret) {
            newAccount.billingStreet = billingStret;
            return this;
        }

        public Builder withBillingCity(String billingCity) {
            newAccount.billingCity = billingCity;
            return this;
        }

        public Builder withBillingState(String billingState) {
            newAccount.billingState = billingState;
            return this;
        }

        public Builder withBillingZip(String billingZip) {
            newAccount.billingZip = billingZip;
            return this;
        }

        public Builder withBillingCountry(String billingCountry) {
            newAccount.billingCountry = billingCountry;
            return this;
        }

        public Builder withShippingAddress(String shippingAddress) {
            newAccount.shippingAddress = shippingAddress;
            return this;
        }

        public Builder withShippingCity(String shippingCity) {
            newAccount.shippingCity = shippingCity;
            return this;
        }

        public Builder withShippingState(String shippingState) {
            newAccount.shippingState = shippingState;
            return this;
        }

        public Builder withShippingZip(String shippingZip) {
            newAccount.shippingZip = shippingZip;
            return this;
        }

        public Builder withShippingCountry(String shippingCountry) {
            newAccount.shippingCountry = shippingCountry;
            return this;
        }

        public Builder withShippingStreet(String shippingStreet) {
            newAccount.shippingStreet = shippingStreet;
            return this;
        }

        public Account build() {
            return newAccount;
        }
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParentAccount() {
        return parentAccount;
    }

    public void setParentAccount(String parentAccount) {
        this.parentAccount = parentAccount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingZip() {
        return shippingZip;
    }

    public void setShippingZip(String shippingZip) {
        this.shippingZip = shippingZip;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }
}
