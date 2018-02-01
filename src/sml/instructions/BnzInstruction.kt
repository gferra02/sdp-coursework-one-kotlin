package sml.instructions

import sml.Instruction
import sml.Machine

/**
 * Describes the SML bnz instruction
 *
 */

class BnzInstruction(label: String, val register: Int, val value: Int) : Instruction(label, "bnz") {

    override fun execute(m: Machine) {
        m.registers.setRegister(register, value)
    }

    override fun toString(): String {
        return super.toString() + " register " + register + " value " + value
    }
}