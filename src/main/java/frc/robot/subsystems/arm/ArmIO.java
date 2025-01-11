package frc.robot.subsystems.arm;


public interface ArmIO{

    default void updateInputs (ArmIOInputs inputs) {}
    default void setVoltage(double appliedVolts) {}
    default void setRPM (double goalRPM) {}
    // default void setLeds(boolean on) {}

    // @AutoLog
    class ArmIOInputs {
        public boolean connected = true;
        public double temperature;
        public double voltage;
        public double current;
        public double rpm;

    }

}
