// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static frc.robot.Constants.IntakeConstants;

public class Intake extends SubsystemBase {
  private final m_motor = new PWMSparkMax(IntakeConstants.kMotorPort);
  private final DoubleSolenoid m_pistons =
      new DoubleSolenoid(
          PneumaticsModuleType.REVPH,
          IntakeConstants.kSolenoidPorts[0],
          IntakeConstants.kSolenoidPorts[1];

  /** Returns a command that deploys the intake, and then runs the intake motor indefinitely. */
  public CommandBase intakeCommand() {
    return runOnce(() -> m_pistons.set(DoubleSolenoid.Value.kForward))
        .andThen(run(() -> m_motor.set(1.0)))
        .withName("Intake");
  }

  /** Returns a command that turns off and retracts the intake. */
  public CommandBase retractCommand() {
    return runOnce(
            () -> {
              m_motor.disable();
              m_pistons.set(DoubleSolenoid.Value.kReverse);
            })
        .withName("Retract");
  }
}
