package com.ymougenel.myMetrics.controllers

import com.ymougenel.myMetrics.models.Metric
import org.springframework.web.bind.annotation.PathVariable

/**
 * Defines a CRUD+ metricController
 */
interface MetricControllerI {

    // ---------------------------------  CRUD  ---------------------------------
    fun create(metric: Metric)

    fun get(@PathVariable id: Long) : Metric

    fun update(metric: Metric)

    fun delete(@PathVariable id: Long)
//
//
//    // -------------------------------- PAGINATION --------------------------------
//    /**
//     * TODO: doc and mapping
//     */
//    fun getMetrics(offset: Long, size: Int, search: String): List<Metric>
//
//    /**
//     * TODO: doc and mapping
//     */
//    fun getMetricsByType(type: MetricTypes, offset: Long, size: Int, search: String): List<Metric>
//
//
//    // -------------------------------- SEARCH --------------------------------
//    /**
//     * TODO: doc and mapping
//     */
//    fun searchByName(name: String)
//
//    /**
//     * TODO: doc and mapping
//     */
//    fun searchByNameAndType(name: String, type: MetricTypes)
}
