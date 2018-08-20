package com.ymougenel.myMetrics.models


import org.springframework.stereotype.Component
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Component
data class Metric(@GeneratedValue(strategy = GenerationType.AUTO) @Id val id: Long?,
                var type: String?,
                var date: LocalDateTime?,
                var value: Float
) {
    constructor() : this(0, null, null, 0f)
}