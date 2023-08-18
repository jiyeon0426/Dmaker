package com.fastcam.programming.dmaker.entity;

import com.fastcam.programming.dmaker.code.DeveloperLevel;
import com.fastcam.programming.dmaker.code.DeveloperSkillType;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class RetiredDeveloper {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected Long id;

    private String memberId;
    private String name;


    @CreatedDate
    private LocalDateTime creatAt;

    @LastModifiedDate
    private LocalDateTime updateAt;
}
