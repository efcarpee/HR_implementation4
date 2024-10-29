package edu.trincoll.hr

class HR(private val employees: List<Employee> = emptyList()) {

    fun hire(employee: Employee): HR {
        val updatedEmployees = employees.toMutableList()
        updatedEmployees.add(employee)
        return HR(updatedEmployees)
    }

    fun fire(id: Int): HR {
        val updatedEmployees = employees.filter { it.id != id }
        return HR(updatedEmployees)
    }

    fun payEmployees(): Double {
        return employees.sumOf { it.pay() }
    }
}
