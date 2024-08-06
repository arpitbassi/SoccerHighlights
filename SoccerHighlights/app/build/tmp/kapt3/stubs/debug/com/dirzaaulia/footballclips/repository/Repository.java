package com.dirzaaulia.footballclips.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/dirzaaulia/footballclips/repository/Repository;", "", "scoreBatService", "Lcom/dirzaaulia/footballclips/network/ScoreBatService;", "(Lcom/dirzaaulia/footballclips/network/ScoreBatService;)V", "getClips", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dirzaaulia/footballclips/util/ResponseResult;", "", "Lcom/dirzaaulia/footballclips/data/model/ClipState;", "app_debug"})
public final class Repository {
    private final com.dirzaaulia.footballclips.network.ScoreBatService scoreBatService = null;
    
    @javax.inject.Inject
    public Repository(@org.jetbrains.annotations.NotNull
    com.dirzaaulia.footballclips.network.ScoreBatService scoreBatService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.WorkerThread
    public final kotlinx.coroutines.flow.Flow<com.dirzaaulia.footballclips.util.ResponseResult<java.util.List<com.dirzaaulia.footballclips.data.model.ClipState>>> getClips() {
        return null;
    }
}