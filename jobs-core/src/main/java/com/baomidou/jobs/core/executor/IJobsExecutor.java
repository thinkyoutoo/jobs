package com.baomidou.jobs.core.executor;

import com.baomidou.jobs.core.model.LogResult;
import com.baomidou.jobs.core.model.TriggerParam;
import com.baomidou.jobs.core.web.JobsResponse;

/**
 * Jobs executor interface
 * 
 * @author xxl jobob
 * @since 2019-06-22
 */
public interface IJobsExecutor {

    /**
     * beat
     *
     * @return
     */
    JobsResponse<String> beat();

    /**
     * idle beat
     *
     * @param jobId
     * @return
     */
    JobsResponse<String> idleBeat(int jobId);

    /**
     * kill
     *
     * @param jobId
     * @return
     */
    JobsResponse<String> kill(int jobId);

    /**
     * log
     *
     * @param logDateTim
     * @param logId
     * @param fromLineNum
     * @return
     */
    JobsResponse<LogResult> log(long logDateTim, int logId, int fromLineNum);

    /**
     * run
     *
     * @param triggerParam
     * @return
     */
    JobsResponse<String> run(TriggerParam triggerParam);

}
