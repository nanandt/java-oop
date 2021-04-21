package progammer.amatir.application;

import progammer.amatir.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Belajar Ga paham2");

        Company.Employee employee = company.new Employee();
        employee.setName("Embuh");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
