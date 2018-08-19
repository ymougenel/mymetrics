package com.ymougenel.myMetrics.controllers

import com.ymougenel.myMetrics.models.Metric
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping

/**
 * Defines a CRUD+ metricController
 */
interface MetricControllerI {

    // ---------------------------------  CRUD  ---------------------------------
    @PostMapping("/TODO")
    fun create(metric: Metric)

    @GetMapping("/{id}")
    fun get(@PathVariable id: Long) : Metric

//    // TODO
//    @PutMapping("/TODO")
//    fun update(metric: Metric)
//
//    @DeleteMapping("{id}")
//    fun delete(@PathVariable id: Long)
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
