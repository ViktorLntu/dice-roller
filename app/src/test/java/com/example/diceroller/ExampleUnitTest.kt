package com.example.diceroller

import org.junit.Test
import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(Parameterized::class)
class ExampleUnitTest(private val numberOfSides: Int) {
    @Test
    fun generates_number() {
        val dice = Dice(numberOfSides)
        val rollResult = dice.roll()

        assertTrue("The value of rollResult was not between 1 and ${numberOfSides}", rollResult in 1..numberOfSides)
    }

    companion object {
        @Parameters
        @JvmStatic
        fun rollValues(): Collection<Array<Int>> {
            return listOf(
                arrayOf(6),
                arrayOf(12),
                arrayOf(25),
                arrayOf(37),
                arrayOf(15),
                arrayOf(49)
            )
        }
    }
}