package com.drew.springtraining.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@Getter
@AllArgsConstructor
public enum ActivationStatus {
    ACTIVE(0), INACTIVE(1);

    private final Integer code;

    public static ActivationStatus fromCode(Integer code) {
        if (code == null) return null;
        return switch (code) {
            case 0 -> ActivationStatus.ACTIVE;
            case 1 -> ActivationStatus.INACTIVE;
            default -> null;
        };
    }

    public static ActivationStatus fromSet(Set<ActivationStatus> statusSet) {
        if (statusSet != null && statusSet.size() == 1) {
            return statusSet.contains(ACTIVE) ? ACTIVE : INACTIVE;
        }
        return null;
    }

    public static Integer getCode(Set<ActivationStatus> statusSet) {
        var status = fromSet(statusSet);
        return status == null ? null : status.getCode();
    }
}
