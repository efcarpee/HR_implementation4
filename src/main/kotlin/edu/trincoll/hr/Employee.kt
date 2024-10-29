package edu.trincoll.hr

abstract class Employee(
    val name: String,
    val id: Int
) : Comparable<Employee> {

    abstract fun pay(): Double

    override fun compareTo(other: Employee): Int {
        return this.id.compareTo(other.id)
    }

    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}
