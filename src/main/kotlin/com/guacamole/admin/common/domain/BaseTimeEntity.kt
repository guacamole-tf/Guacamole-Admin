package com.guacamole.admin.common.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import java.time.ZoneId
import jakarta.persistence.Column
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
open class BaseTimeEntity(

    @CreatedDate
    @Column(nullable = false, updatable = false)
    var createAt: LocalDateTime = LocalDateTime.now(ZoneId.of("Asia/Seoul")),

    @LastModifiedDate
    @Column(nullable = false)
    var updateAt: LocalDateTime = LocalDateTime.now(ZoneId.of("Asia/Seoul")),
) {
}