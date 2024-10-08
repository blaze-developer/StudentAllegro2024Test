package frc.robot.subsystems.Tramp;

public class TrampConstants {
  public class KeepoutZone {
    public static final double kElevatorHeight = 0.21;
    public static final double kMinArm = 5.0;
    public static final double kMaxArm = 75.0;
  }

  public class Elevator {
    public static final int kMotorCANID = 6;
    public static final boolean kInverted = true;
    public static final double kCurrentLimit = 60.0;
    public static final double kMetersPerRev = 0.003896166;
    public static final double kTargetPosTolerance = 0.0508;
    public static final double kTargetVelTolerance = 1.000;
    public static final double kSimGearRatio = 0.6;
    public static final double kSimMotorLoad = 0.00001;
    public static final double kMinPosition = 0.0;
    public static final double kMaxPosition = 0.430;

    public class Positions {
      public static final double kStowed = 0.0;
      public static final double kTransfer = 0.0;
      public static final double kAmp = 0.2;
      public static final double kTrap = 0.2411;
      public static final double kTrap1 = 0.2522;
      public static final double kTrap2 = 0.3222;
      public static final double kTrap3 = 0.2411;
      public static final double kTrap4 = 0.2411;
      public static final double kBasicClimb = 0.2;
    }

    public class PID {
      public static final double kP = 8.0;
      public static final double kI = 0.0;
      public static final double kD = 0.0;
      public static final double kV = 0.0;
      public static final double kA = 0.0;
      public static final double kG = 0.25;
      public static final double kS = 0.0;
    }
    ;

    public class MotionMagic {
      public static final double kMaxVelocity = 89.0;
      public static final double kMaxAcceleration = 2246;
      public static final double kJerk = 10000;
    }
  }

  public class Arm {
    public static final int kMotorCANID = 7;
    public static final boolean kInverted = true;
    public static final double kCurrentLimit = 60.0;
    public static final double kDegreesPerRev = 24.30790007;
    public static final double kTargetPosTolerance = 4.0;
    public static final double kTargetVelTolerance = 100.0;
    public static final double kSimGearRatio = 2.0;
    public static final double kSimMotorLoad = 0.00001;
    public static final double kMinPosition = 0.0;
    public static final double kMaxPosition = 12.5;

    public class Positions {
      public static final double kStowed = 0.0;
      public static final double kTransfer = 0.0;
      public static final double kAmp = 225.0;
      public static final double kTrap = 180;
      public static final double kTrap1 = 121;
      public static final double kTrap2 = 121;
      public static final double kTrap3 = 150;
      public static final double kTrap4 = 225;
      public static final double kBasicClimb = 180.0;
    }

    public class PID {
      public static final double kP = 4.0;
      public static final double kI = 0.0;
      public static final double kD = 0.0;
      public static final double kV = 0.1;
      public static final double kA = 0.0;
      public static final double kG = 0.0;
      public static final double kS = 0.0;
    }
    ;

    public class MotionMagic {
      public static final double kMaxVelocity = 24.0;
      public static final double kMaxAcceleration = 180.0;
      public static final double kJerk = 10000;
    }
  }

  public class Manipulator {
    public static final int kMotorCANID = 9;
    public static final boolean kInverted = true;
    public static final double kCurrentLimit = 60.0;
    public static final double kEjectVoltage = 6.0;
    public static final double kEjectTime = 0.5;
    public static final double kTransferVoltage = 4.0;
    public static final double kShootTime = 1.5;
    public static final double kShootPower = 1.0;
    public static final double kTrapMoveNoteDistance = 0.7;
    public static final double kTrapMoveNotePower = 0.05;
    public static final double kDepositTime = 1.5;
    public static final double kDepositPower = -1.0;

    public class PID {
      public static final double kP = 300;
      public static final double kI = 0.0;
      public static final double kD = 0.0;
      public static final double kV = 0.0;
      public static final double kA = 0.0;
      public static final double kG = 0.0;
      public static final double kS = 0.0;
    }
    ;
  }

  public class Climber {
    public static final int kMotorCANID = 10;
    public static final boolean kInverted = true;
    public static final double kCurrentLimit = 60.0;
    public static final double kSimGearRatio = 2.0;
    public static final double kSimMotorLoad = 0.00001;
    public static final double kMoveClimberVoltage = 12.0;
    public static final double kClimberUpPosition = 0.5746;
    public static final double kClimberDownPosition = 0.0;
  }
}
