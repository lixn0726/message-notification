package com.example.apicommon.domain;

/**
 * @author lixn
 * @date 2022/01/11 09:11
 *
 * 通用的消息内容实体类
 **/
public class MessageContent {

    private String contentId; // 内容id

    private String content; // 内容

    private String supplierId; // 消息发出者

    private String receiverId; // 消息接受者

    private long timestamp; // 时间戳

    public static builder builder() {
        return new builder();
    }

    public static class builder {
        private String contentId;
        private String content; // 内容
        private String supplierId; // 消息发出者
        private String receiverId; // 消息接受者
        private long timestamp; // 时间戳

        private builder() {
        }

        public builder contentId(String contentId) {
            this.contentId = contentId;
            return this;
        }

        public builder content(String content) {
            this.content = content;
            return this;
        }

        public builder supplierId(String supplierId) {
            this.supplierId = supplierId;
            return this;
        }

        public builder receiverId(String receiverId) {
            this.receiverId = receiverId;
            return this;
        }

        public builder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public MessageContent build() {
            MessageContent messageContent = new MessageContent();
            messageContent.setContent(content);
            messageContent.setSupplierId(supplierId);
            messageContent.setReceiverId(receiverId);
            messageContent.setTimestamp(timestamp);
            return messageContent;
        }
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "MessageContent{" +
                "content='" + content + '\'' +
                ", supplierId='" + supplierId + '\'' +
                ", receiverId='" + receiverId + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
