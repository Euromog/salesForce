package models;

public class Contact {
    String firstName,
            lastName,
            middleName,
            suffix,
            salutation,
            accountName,
            title,
            email,
            phone,
            mobile,
            reportsTo,
            department,
            fax,
            mailingAddress,
            mailingStreet,
            mailingCity,
            mailingZip,
            mailingState,
            mailingCountry;

    public static class Builder {
        private Contact newContact;

        public Builder() {
            newContact = new Contact();
        }

        public Builder withFirstName(String firstName) {
            newContact.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            newContact.lastName = lastName;
            return this;
        }

        public Builder withMiddleName(String middleName) {
            newContact.middleName = middleName;
            return this;
        }

        public Builder withSuffix(String suffix) {
            newContact.suffix = suffix;
            return this;
        }

        public Builder withSalutation(String salutation) {
            newContact.salutation = salutation;
            return this;
        }

        public Builder withAccountName(String accountName) {
            newContact.accountName = accountName;
            return this;
        }

        public Builder withTitle(String title) {
            newContact.title = title;
            return this;
        }

        public Builder withMobile(String mobile) {
            newContact.mobile = mobile;
            return this;
        }

        public Builder withPhone(String phone) {
            newContact.phone = phone;
            return this;
        }

        public Builder withReportsTo(String reportsTo) {
            newContact.reportsTo = reportsTo;
            return this;
        }

        public Builder withDepartment(String department) {
            newContact.department = department;
            return this;
        }

        public Builder withFax(String fax) {
            newContact.fax = fax;
            return this;
        }

        public Builder withMailingAddress(String mailingAddress) {
            newContact.mailingAddress = mailingAddress;
            return this;
        }

        public Builder withEmail(String email) {
            newContact.email = email;
            return this;
        }

        public Builder withMailingState(String mailingState) {
            newContact.mailingState = mailingState;
            return this;
        }

        public Builder withMailingZip(String mailingZip) {
            newContact.mailingZip = mailingZip;
            return this;
        }

        public Builder withMailingCity(String mailingCity) {
            newContact.mailingCity = mailingCity;
            return this;
        }

        public Builder withMailingStreet(String mailingStreet) {
            newContact.mailingStreet = mailingStreet;
            return this;
        }

        public Builder withMailingCountry(String mailingCountry) {
            newContact.mailingCountry = mailingCountry;
            return this;
        }

        public Contact getNewContact() {
            return newContact;
        }

        public Contact build() {
            return newContact;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(String reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingZip() {
        return mailingZip;
    }

    public void setMailingZip(String mailingZip) {
        this.mailingZip = mailingZip;
    }

    public String getMailingState() {
        return mailingState;
    }

    public void setMailingState(String mailingState) {
        this.mailingState = mailingState;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }
}
