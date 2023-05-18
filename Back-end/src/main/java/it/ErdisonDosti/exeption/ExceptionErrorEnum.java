package it.ErdisonDosti.exeption;

import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public enum ExceptionErrorEnum {
    GENNERIC_E(10001, "An error has occurred"),
    JWT_USER_DISABLED(20001, "User not active"),
    JWT_CREDENTIAL(20002, "Invalid credentials"),
    JWT_TOKEN_EXPIRED(20003, "Expired token"),
    JWT_TOKEN_GENERIC_ERROR(20004, "Wrong token"),
    JWT_TOKEN_MISSED(20005, "Missing token"),

    PB_PROGRESS_REPORT_NFE(90001, "PB Progress report not found"),
    PB_ANAG_ACTION_NFE(90002, "PB Anag Action not found"),
    PB_PROGRESS_REPORT_ACTION_NFE(90003, "PB Progress Report Action not found"),
    PB_USER_USERNAME_NOT_FOUND(90004, "PB User Username not found"),
    PB_PROJECT_NFE(90005, "PB Project not found"),
    PB_USER_NFE(90006, "PB User not found"),
    PB_MANUAL_STOP_FIRST_PHASE(80001, "Can't stop first phase "),
    PB_MANUAL_STOP_BEFORE_ACTION_IS_STOP(80002, "This phase can't be stopped since there is already one stop action"),
    PB_MANUAL_STOP_AFTER_ACTION_IS_STOP(80003, "This phase can't be stopped since there is already one stop action"),
    PB_MANUAL_STOP_NO_ACTION_TO_STOP(80004, "This phase can't be stopped for this date, You should choose another date"),
    PB_MANUAL_STOP_WINDOW_OTHER_ACTIONS(80005, "There are some actions between the stop and restart date, please choose another date"),
    PB_MANUAL_STOP_WINDOW_OTHER_ACTIONS_IN_PREV_PHASE(80006, "There are some actions between the stop and restart date in the previous phase, please choose another date"),
    PB_MANUAL_STOP_WINDOW_OTHER_ACTIONS_IN_NEXT_PHASE(80007, "There are some actions between the stop and restart date in the next phase, please choose another date "),
    PB_MANUAL_RESTART_NO_START_ACTION_EXCEPTION(80008, "This phase can't be restarted"),
    PB_MANUAL_START_NO_ACTION_TO_START_EXCEPTION(80009, "This phase can't be restarted for this date, You should choose another date"),
    PB_EMPTY_NOTE_FIELD_EXCEPTION(80010, "The reason field is required"),
    PB_MANUAL_NO_STOP_RESTART_BEFORE_FIRST_ACTION_OF_PHASE_EXCEPTION(80011, "It is not possible to insert actions for the selected dates"),
    PB_MANUAL_NO_STOP_RESTART_AFTER_STOP_ACTION_EXCEPTION(80012, "It is not possible to insert actions for the selected dates"),
    PB_MANUAL_STOP_WHEN_NEXT_PHASE_IS_RUNNING_EXCEPTION(80013,"You can't just enter one stop for this phase, you should click 'Stop and Restart' to manage the count"),
    PB_MANUAL_RESTART_FROM_EMS_REVERT_ACTION_EXCEPTION(80014,"This phase can't be restarted since the report has been reverted from eMS"),
    PB_MANUAL_STOP_RESTART_FROM_DATE_AFTER_NEXT_ACTION_DATE(80015,"It is not possible to insert actions for the selected dates, please choose another date");
    @Getter
    private final int code;
    @Getter
    private final String message;

    @Override
    public String toString() {
        return this.code + ": " + this.message;
    }
}
