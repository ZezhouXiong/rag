package com.github.xiaoymin.llm.domain.llm;

import lombok.Data;

/**
 * @author  zezhou xiong</a>
 * 2023/10/06 14:33
 * @since llm_chat_java_hello
 */
@Data
public class ChunkResult {
    private String docId;
    private int chunkId;
    private String content;

}
