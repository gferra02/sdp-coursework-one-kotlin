package sml.instructions

import sml.Instruction
import sml.Labels
import sml.Machine

/**
 * Describes the SML bnz instruction
 *
 */

class BnzInstruction(label: String, val register: Int, val nextLabel: String) : Instruction(label, "bnz") {

    override fun execute(m: Machine) {

        // Check value in register is not 0 before branching
        val regval = m.registers.getRegister(register)

        if (regval != 0) // execute where label == nextLabel
            println("Value not zero")

        // RECURSION

        // else nothing, it should read the last instruction and execute "out"
        // TODO() remove. here for testing purposes
        else println("Zero, should go to end of programme")
    }

    override fun toString(): String {
        // return super.toString() + " register " + register + " value " + value
        return super.toString() + " current register: $register label: $label nextLabel: $nextLabel"
    }
}