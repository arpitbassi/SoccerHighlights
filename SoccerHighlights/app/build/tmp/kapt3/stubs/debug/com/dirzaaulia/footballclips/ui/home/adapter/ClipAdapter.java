package com.dirzaaulia.footballclips.ui.home.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0014B\u001d\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/dirzaaulia/footballclips/ui/home/adapter/ClipAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/dirzaaulia/footballclips/data/model/ClipState;", "Lcom/dirzaaulia/footballclips/ui/home/adapter/ClipAdapter$ViewHolder;", "onClipsClicked", "Lkotlin/Function1;", "Lcom/dirzaaulia/footballclips/data/model/Clip;", "", "Lcom/dirzaaulia/footballclips/ui/home/adapter/OnClipsClicked;", "(Lkotlin/jvm/functions/Function1;)V", "getItemViewType", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "app_debug"})
public final class ClipAdapter extends androidx.recyclerview.widget.ListAdapter<com.dirzaaulia.footballclips.data.model.ClipState, com.dirzaaulia.footballclips.ui.home.adapter.ClipAdapter.ViewHolder> {
    private final kotlin.jvm.functions.Function1<com.dirzaaulia.footballclips.data.model.Clip, kotlin.Unit> onClipsClicked = null;
    @org.jetbrains.annotations.NotNull
    public static final com.dirzaaulia.footballclips.ui.home.adapter.ClipAdapter.Companion Companion = null;
    public static final int PLACEHOLDER = 0;
    public static final int DATA = 1;
    
    public ClipAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.dirzaaulia.footballclips.data.model.Clip, kotlin.Unit> onClipsClicked) {
        super(null);
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.dirzaaulia.footballclips.ui.home.adapter.ClipAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.dirzaaulia.footballclips.ui.home.adapter.ClipAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u0082\u0001\u0002\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/dirzaaulia/footballclips/ui/home/adapter/ClipAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/viewbinding/ViewBinding;", "(Landroidx/viewbinding/ViewBinding;)V", "DataViewHolder", "PlaceholderViewHolder", "Lcom/dirzaaulia/footballclips/ui/home/adapter/ClipAdapter$ViewHolder$DataViewHolder;", "Lcom/dirzaaulia/footballclips/ui/home/adapter/ClipAdapter$ViewHolder$PlaceholderViewHolder;", "app_debug"})
    public static abstract class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        private ViewHolder(androidx.viewbinding.ViewBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/dirzaaulia/footballclips/ui/home/adapter/ClipAdapter$ViewHolder$PlaceholderViewHolder;", "Lcom/dirzaaulia/footballclips/ui/home/adapter/ClipAdapter$ViewHolder;", "binding", "Lcom/dirzaaulia/footballclips/databinding/ShimmerItemClipsBinding;", "(Lcom/dirzaaulia/footballclips/databinding/ShimmerItemClipsBinding;)V", "bindPlaceholder", "", "app_debug"})
        public static final class PlaceholderViewHolder extends com.dirzaaulia.footballclips.ui.home.adapter.ClipAdapter.ViewHolder {
            
            public PlaceholderViewHolder(@org.jetbrains.annotations.NotNull
            com.dirzaaulia.footballclips.databinding.ShimmerItemClipsBinding binding) {
                super(null);
            }
            
            public final void bindPlaceholder() {
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/dirzaaulia/footballclips/ui/home/adapter/ClipAdapter$ViewHolder$DataViewHolder;", "Lcom/dirzaaulia/footballclips/ui/home/adapter/ClipAdapter$ViewHolder;", "binding", "Lcom/dirzaaulia/footballclips/databinding/ItemClipsBinding;", "onClipsClicked", "Lkotlin/Function1;", "Lcom/dirzaaulia/footballclips/data/model/Clip;", "", "Lcom/dirzaaulia/footballclips/ui/home/adapter/OnClipsClicked;", "(Lcom/dirzaaulia/footballclips/databinding/ItemClipsBinding;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "Lcom/dirzaaulia/footballclips/data/model/ClipState;", "app_debug"})
        public static final class DataViewHolder extends com.dirzaaulia.footballclips.ui.home.adapter.ClipAdapter.ViewHolder {
            private final com.dirzaaulia.footballclips.databinding.ItemClipsBinding binding = null;
            private final kotlin.jvm.functions.Function1<com.dirzaaulia.footballclips.data.model.Clip, kotlin.Unit> onClipsClicked = null;
            
            public DataViewHolder(@org.jetbrains.annotations.NotNull
            com.dirzaaulia.footballclips.databinding.ItemClipsBinding binding, @org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function1<? super com.dirzaaulia.footballclips.data.model.Clip, kotlin.Unit> onClipsClicked) {
                super(null);
            }
            
            public final void bind(@org.jetbrains.annotations.NotNull
            com.dirzaaulia.footballclips.data.model.ClipState item) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/dirzaaulia/footballclips/ui/home/adapter/ClipAdapter$Companion;", "", "()V", "DATA", "", "PLACEHOLDER", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}