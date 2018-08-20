package com.ymougenel.myMetrics.persistence

import com.ymougenel.myMetrics.models.Metric
import org.springframework.data.repository.CrudRepository
import java.time.LocalDateTime

interface MetricsDAO : CrudRepository<Metric, Long> {
    fun findByDate(date: LocalDateTime): List<Metric>
    fun findByType(type: String): List<Metric>

}