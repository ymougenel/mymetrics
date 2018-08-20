package com.ymougenel.myMetrics.controllers.impl

import com.ymougenel.myMetrics.controllers.MetricControllerI
import com.ymougenel.myMetrics.models.Metric
import com.ymougenel.myMetrics.persistence.MetricsDAO
import io.swagger.annotations.Api
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.rest.webmvc.ResourceNotFoundException
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@CrossOrigin
@Controller
@RequestMapping(path = arrayOf("/metrics"))
@Api(description = "CRUD Metric Controller")
class MetricController : MetricControllerI {

    @Autowired
    private var metricsDao: MetricsDAO

    @Autowired
    constructor(metricsDAO: MetricsDAO) {
        this.metricsDao = metricsDAO
    }

    @PostMapping("/")
    @ResponseBody
    override fun create(@RequestBody metric: Metric) {
        metricsDao.save(metric)
    }

    @GetMapping("/{id}")
    override fun get(id: Long): Metric {
        return metricsDao.findById(id)
                .orElseThrow { ResourceNotFoundException("Metrics with id ${id} not found") }
    }

    @PutMapping("/")
    @ResponseBody
    override fun update(@RequestBody metric: Metric) {
        // TODO handle error
        metricsDao.save(metric)
    }

    @DeleteMapping("/{id}")
    override fun delete(id: Long) {
        // TODO handle error
        metricsDao.deleteById(id)
    }

}