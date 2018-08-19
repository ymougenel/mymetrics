package com.ymougenel.myMetrics.controllers

import com.ymougenel.myMetrics.models.Metric
import com.ymougenel.myMetrics.models.MetricTypes

/**
 * Defines a CRUD+ metricController
 */
interface MetricController {

    // ---------------------------------  CRUD  ---------------------------------
    fun create(metric: Metric)

    fun get(id: Long)

    fun update(metric: Metric)

    fun delete(id: Long)


    // -------------------------------- PAGINATION --------------------------------
    /**
     * TODO: doc
     */
    fun getMetrics(offset: Long, size: Int, search: String): List<Metric>

    /**
     * TODO: doc
     */
    fun getMetricsByType(type: MetricTypes, offset: Long, size: Int, search: String): List<Metric>


    // -------------------------------- PAGINATION --------------------------------
    /**
     * TODO: doc
     */
    fun searchByName(name: String)
    /**
     * TODO: doc
     */
    fun searchByNameAndType(name: String, type: MetricTypes)
}
