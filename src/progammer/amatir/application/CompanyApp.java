package progammer.amatir.application;

import progammer.amatir.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Belajar Ga paham2");

        Company.Employee employee = company.new Employee();
        employee.setName("Saya");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("PtPt nggo tuku otak2");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Candra");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
