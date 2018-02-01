package sml.instructions

import sml.Instruction
import sml.Machine

/**
 * Describes the SML bnz instruction
 *
 */

class BnzInstruction(label: String, val register: Int, val branch: String) : Instruction(label, "bnz") {

    // I need to read the value in the register referred to in the instruction
    override fun execute(m: Machine) {
        m.registers.setRegister(register, value)
    }

    override fun toString(): String {
        return super.toString() + " register " + register + " value " + value
    }
}