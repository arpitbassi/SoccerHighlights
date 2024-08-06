package com.dirzaaulia.footballclips.ui.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\u000eR\"\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/dirzaaulia/footballclips/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/dirzaaulia/footballclips/repository/Repository;", "(Lcom/dirzaaulia/footballclips/repository/Repository;)V", "_clips", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/dirzaaulia/footballclips/util/ResponseResult;", "", "Lcom/dirzaaulia/footballclips/data/model/ClipState;", "clips", "Lkotlinx/coroutines/flow/StateFlow;", "getClips", "()Lkotlinx/coroutines/flow/StateFlow;", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.dirzaaulia.footballclips.repository.Repository repository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.dirzaaulia.footballclips.util.ResponseResult<java.util.List<com.dirzaaulia.footballclips.data.model.ClipState>>> _clips = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.dirzaaulia.footballclips.util.ResponseResult<java.util.List<com.dirzaaulia.footballclips.data.model.ClipState>>> clips = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.dirzaaulia.footballclips.repository.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.dirzaaulia.footballclips.util.ResponseResult<java.util.List<com.dirzaaulia.footballclips.data.model.ClipState>>> getClips() {
        return null;
    }
    
    public final void getClips() {
    }
}