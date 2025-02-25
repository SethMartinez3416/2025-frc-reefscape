package frc.robot.subsystems;

import edu.wpi.first.epilogue.Logged;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.manipulator.CoralIntakeCommand;
import frc.robot.config.CoralIntakeSubsystemConfig;

/**
 *
 */
@Logged
public class CoralIntakeSubsystem extends IntakeSubsystemBase<CoralIntakeSubsystemConfig> {

    public Command inject() {
        return new CoralIntakeCommand(this, true);
    }

    public Command eject() {
        return new CoralIntakeCommand(this, false);
    }

    @Override
    protected CoralIntakeSubsystemConfig getConfig() {
        return subsystemsConfig.coralIntakeSubsystem;
    }

}