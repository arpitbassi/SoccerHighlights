package com.dirzaaulia.footballclips.ui.home;

import java.lang.System;

@android.annotation.SuppressLint(value = {"SourceLockedOrientationActivity"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001e\u0010\u001b\u001a\u00020\u000e2\u0014\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u001dH\u0002J\b\u0010 \u001a\u00020\u000eH\u0002J\b\u0010!\u001a\u00020\u000eH\u0002J\b\u0010\"\u001a\u00020\u000eH\u0002J\b\u0010#\u001a\u00020\u000eH\u0002J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020\u000eH\u0002J\u0018\u0010(\u001a\u00020\u000e2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006*"}, d2 = {"Lcom/dirzaaulia/footballclips/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/dirzaaulia/footballclips/ui/home/adapter/ClipAdapter;", "binding", "Lcom/dirzaaulia/footballclips/databinding/FragmentHomeBinding;", "viewModel", "Lcom/dirzaaulia/footballclips/ui/home/HomeViewModel;", "getViewModel", "()Lcom/dirzaaulia/footballclips/ui/home/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onClipsClicked", "", "item", "Lcom/dirzaaulia/footballclips/data/model/Clip;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setUIFromState", "state", "Lcom/dirzaaulia/footballclips/util/ResponseResult;", "", "Lcom/dirzaaulia/footballclips/data/model/ClipState;", "setupAdapter", "setupFloatingActionButton", "setupRecyclerView", "setupSwipeRefresh", "showErrorView", "errorMessage", "", "subscribeClips", "updateList", "list", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.dirzaaulia.footballclips.databinding.FragmentHomeBinding binding;
    private final com.dirzaaulia.footballclips.ui.home.adapter.ClipAdapter adapter = null;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public HomeFragment() {
        super();
    }
    
    private final com.dirzaaulia.footballclips.ui.home.HomeViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupSwipeRefresh() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void setupFloatingActionButton() {
    }
    
    private final void setupAdapter() {
    }
    
    private final void subscribeClips() {
    }
    
    private final void setUIFromState(com.dirzaaulia.footballclips.util.ResponseResult<? extends java.util.List<com.dirzaaulia.footballclips.data.model.ClipState>> state) {
    }
    
    private final void showErrorView(java.lang.String errorMessage) {
    }
    
    private final void updateList(java.util.List<com.dirzaaulia.footballclips.data.model.ClipState> list) {
    }
    
    private final void onClipsClicked(com.dirzaaulia.footballclips.data.model.Clip item) {
    }
}