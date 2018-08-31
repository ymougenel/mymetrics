package com.ymougenel.myMetrics.controllers.impl

import com.ymougenel.myMetrics.controllers.MetricControllerI
import com.ymougenel.myMetrics.models.Metric
import com.ymougenel.myMetrics.persistence.MetricsDAO
import io.swagger.annotations.Api
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.rest.webmvc.ResourceNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@CrossOrigin
@RestController
@EnableWebMvc
@RequestMapping(path = arrayOf("/metrics"))
@Api(description = "CRUD Metric Controller")
class MetricController : MetricControllerI {

    @Autowired
    private var metricsDao: MetricsDAO

    @Autowired
    constructor(metricsDAO: MetricsDAO) {
        this.metricsDao = metricsDAO
    }

    @PostMapping(path = arrayOf("/"), consumes = [MediaType.APPLICATION_JSON_VALUE] )
    @ResponseStatus(HttpStatus.CREATED)
    override fun create(@RequestBody metric: Metric) {
        metricsDao.save(metric)
    }

    @GetMapping(path = arrayOf("/{id}"), produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    override fun get(@PathVariable id: Long): Metric {
        return metricsDao.findById(id)
                .orElseThrow { ResourceNotFoundException("Metrics with id ${id} not found") }
    }

    @PutMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], path = arrayOf("/dfdsf"))
    @ResponseBody
    override fun update(@RequestBody metric: Metric) {
        // TODO handle error
        metricsDao.save(metric)
    }

    @PutMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], path = arrayOf("/"))
    fun update2(@RequestBody metric: Metric) {
        // TODO handle error
//        metricsDao.save(metric)
    }

    @DeleteMapping("/{id}")
    override fun delete(id: Long) {
        // TODO handle error
        metricsDao.deleteById(id)
    }

    @GetMapping()
}