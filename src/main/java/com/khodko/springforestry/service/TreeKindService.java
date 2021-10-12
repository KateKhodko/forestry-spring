package com.khodko.springforestry.service;

import com.khodko.springforestry.entity.TreeKind;
import com.khodko.springforestry.repository.TreeKindRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TreeKindService {

    private TreeKindRepository treeKindRepository;

    public List<TreeKind> findAll() {
        return (List<TreeKind>) treeKindRepository.findAll();
    }
}
