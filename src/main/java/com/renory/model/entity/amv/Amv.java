/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renory.model.entity.amv;

import com.renory.model.entity.amv.videoclip.VideoClip;
import java.io.File;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author smit
 */
public class Amv{
    
    private int id;
    private String alias;
    private int uploaderUserId;
    private String title;
    private String description;
    private int studioId;
    private Date timeCreated;
    private Timestamp timeUploaded;
    private File poster;
    private int hitsOfPage;
    private int hitsOfOnlineView;
    private int downloadsCount;
    private boolean canComment;
    private Authors authors;
    private AnimeSrc animeSrc;
    private MusicSrc musicSrc;
    private CategoryAmvR category;
    private VideoClipR videos;
    private ScreenShotR screenShots;
    private EvaluateR evaluating;
    private AccessTypeR accessType;
    private AllowedUsers allowedUsers;
    private Urls urls;
    private boolean isComplete; 
    
}