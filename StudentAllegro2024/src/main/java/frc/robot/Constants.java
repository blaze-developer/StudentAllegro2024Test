// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class IntakeShooterConstants {
    public static class FeederConstants{
      public static final double kP = 0.0;
      public static final double kD = 0.0;
      public static final double kV = 0.0;

      public static final double gearRatio = 1.0;

      public static final double intakeTarget = 0.0;

      public static final double keepSpinningIntakeTarget = 0.0;
    }

    public static class UpDownConstants{
      public static final double kP = 0.0;
      public static final double kD = 0.0;
      public static final double kV = 0.0;

      public static final double gearRatio = 1.0;

      public static final double intakeTarget = 0.0;
    }

    public static class Shooter1Constants{
      public static final double kP = 0.0;
      public static final double kD = 0.0;
      public static final double kV = 0.0;

      public static final double gearRatio = 1.0;
    }

    public static class Shooter2Constants{
      public static final double kP = 0.0;
      public static final double kD = 0.0;
      public static final double kV = 0.0;

      public static final double gearRatio = 1.0;
    }

    public static class TiltConstants{
      public static final double kP = 0.0;
      public static final double kD = 0.0;
      public static final double kV = 0.0;

      public static final double gearRatio = 1.0;
      
      public static final double intakeTarget = 0.0;
      public static final double upDownCanMoveIntakeTarget = 0.0;
    }
  }
}
