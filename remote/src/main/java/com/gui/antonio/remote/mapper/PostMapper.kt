package com.gui.antonio.remote.mapper

import com.gui.antonio.data.model.PostData
import com.gui.antonio.remote.model.PostRemote

class PostMapper : Mapper<PostRemote, PostData> {

    override fun from(f: PostRemote): PostData {
        return PostData(
            f.userId,
            f.id,
            f.title,
            f.body
        )
    }

    override fun to(t: PostData): PostRemote {
        return PostRemote(
            t.userId,
            t.id,
            t.title,
            t.body
        )
    }
}