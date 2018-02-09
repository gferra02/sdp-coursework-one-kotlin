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

        if (regval != 0) {
            // Assign index to pc
            m.pc = m.labels.getLabels().indexOf(nextLabel)
        }
    }

    override fun toString(): String {
        return super.toString() + " current register: $register, current label: $label, next label: $nextLabel"
    }
}
