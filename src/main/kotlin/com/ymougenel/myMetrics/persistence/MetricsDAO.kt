package com.ymougenel.myMetrics.persistence

import com.ymougenel.myMetrics.models.Metric
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import java.time.LocalDateTime

interface MetricsDAO : JpaRepository<Metric, Long> {
    fun findByDate(date: LocalDateTime): List<Metric>
    fun findByType(type: String): List<Metric>

}