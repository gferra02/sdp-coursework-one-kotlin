package sml.instructions

import sml.Instruction
import sml.Machine

/**
 * Describes the SML out instruction
 *
 */

class OutInstruction(label: String, val register: Int, var result: Int) : Instruction (label, "out") {
    override fun execute(m: Machine) {
        // Check value in register to print it's value out
        result = m.registers.getRegister(register)
        println(result)
    }

    override fun toString(): String {
        return super.toString() + " Value in reg $register"
    }
}