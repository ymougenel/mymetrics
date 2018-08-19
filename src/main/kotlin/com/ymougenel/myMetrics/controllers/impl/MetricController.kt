package com.ymougenel.myMetrics.controllers.impl

import com.ymougenel.myMetrics.controllers.MetricControllerI
import com.ymougenel.myMetrics.models.Metric
import com.ymougenel.myMetrics.models.mocks.MetricMock
import io.swagger.annotations.Api
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping

@CrossOrigin
@Controller
@RequestMapping(path = arrayOf("/metrics"))
@Api(description = "CRUD Metric Controller")
class MetricController : MetricControllerI {

    override fun create(metric: Metric) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun get(id: Long): Metric {
        return MetricMock.get()
    }


}