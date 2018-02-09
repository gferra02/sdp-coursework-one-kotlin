package sml.instructions

import sml.Instruction
import sml.Machine

/**
 * Describes the SML bnz instruction
 *
 */

class BnzInstruction(label: String, val register: Int, val nextLabel: String) : Instruction(label, "bnz") {

    override fun execute(m: Machine) {

        // Check value in register is not 0 before branching
        val regval = m.registers.getRegister(register)
        val nextInst = m.getInstruction(nextLabel)

        if (regval != 0)
            // println(regval)
            println("Next inst: $nextInst")

            // TODO() Get the whole instruction
            // execute where label == nextLabel
            // RECURSION

            println(nextInst.execute(m))
    }

    override fun toString(): String {
        return super.toString() + " current register: $register label: $label nextLabel: $nextLabel"
    }
}
