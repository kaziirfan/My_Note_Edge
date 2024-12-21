package com.example.mynote.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.mynote.dao.NoteDao;
import com.example.mynote.database.NoteDatabase;
import com.example.mynote.model.Note;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public
