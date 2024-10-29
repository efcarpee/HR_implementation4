package edu.trincoll.hr

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HourlyTest {
    private val tolerance = 0.01  // Define a small tolerance for floating-point comparisons

    @Test
    fun `test hourly employee pay calculation`() {
        val employee = Hourly("Eve", 5, 20.0, 80.0)
        assertEquals(1600.0, employee.pay(), tolerance)
    }

    @Test
    fun `test hourly employee toString`() {
        val employee = Hourly("Frank", 6, 25.0, 75.0)
        assertEquals("Hourly(name=Frank, id=6, rate=25.0, hours=75.0)", employee.toString())
    }

    @Test
    fun `test hourly employee with overtime`() {
        val employee = Hourly("Grace", 7, 20.0, 100.0)  // Assuming no overtime pay for simplicity
        assertEquals(2000.0, employee.pay(), tolerance)
    }

    @Test
    fun `test hourly employee with very low hours`() {
        val employee = Hourly("Henry", 8, 15.0, 10.0)
        assertEquals(150.0, employee.pay(), tolerance)
    }

    @Test
    fun `test hourly employee with default hours`() {
        val employee = Hourly("Ivy", 9, 18.0)  // Using default 80.0 hours
        assertEquals(1440.0, employee.pay(), tolerance)
    }
}
