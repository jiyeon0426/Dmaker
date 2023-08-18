package com.fastcam.programming.dmaker.dto;

import com.fastcam.programming.dmaker.code.DeveloperLevel;
import com.fastcam.programming.dmaker.code.DeveloperSkillType;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

public class EditDeveloper {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @ToString
    public static class Request{
        @NotNull
        private DeveloperLevel developerLevel;
        @NotNull
        private DeveloperSkillType developerSkillType;
        @Min(0)
        @Max(20)
        @NotNull
        private Integer experienceYears;
    }

}
